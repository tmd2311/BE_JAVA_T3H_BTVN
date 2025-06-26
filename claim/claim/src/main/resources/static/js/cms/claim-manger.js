const PAGE_SIZE = 6;
const PAGE_INDEX_INIT = 0;
const BASE_URL = 'http://localhost:8080';

window.onload = async () => {
  await renderData(PAGE_INDEX_INIT);
}

async function renderData (pageIndex){
  let responseDataApi = await callApiClaim(pageIndex);
  renderTable(responseDataApi);
  renderPaging(responseDataApi);
}


async function callApiClaim(pageIndex){
  let claimCode = document.getElementById("search-ma-yeu-cau").value || '';
  let fromDate = document.getElementById('from-date').value || '';
  let toDate = document.getElementById('to-date').value || '';
  let statusCode = document.getElementById('trang-thai-yeu-cau').value || '';

  let url = `${BASE_URL}/api/v1/claim?page=${pageIndex}&size=${PAGE_SIZE}&claimCode=${claimCode}&fromDate=${fromDate}&toDate=${toDate}&codeStatus=${statusCode}`;

  try {
    let response = await fetch(url);
    if (!response.ok) throw new Error("API error");
    return await response.json();
  } catch (err) {
    alert("Lỗi khi gọi API: " + err.message);
    return {
      data: [],
      totalPage: 0,
      pageIndex: 0,
      pageSize: PAGE_SIZE
    };
  }
}
function renderPaging(responseDataApi){
  let currentPage = responseDataApi.pageIndex;
  let totalPage = responseDataApi.totalPage;
  let parentPaging = document.getElementsByClassName("pagination")[0];
  parentPaging.innerHTML = '';
  for (let i = 0; i < totalPage; i++) {
    let pageIndexDisplay = i + 1;
    let page = `<li class="page-item"><a class="page-link" onclick="changePage(${i})">${pageIndexDisplay}</a></li>`
    if (i === currentPage){
      page = `<li class="page-item active"><a class="page-link" onclick="changePage(${i})">${pageIndexDisplay}</a></li>`
    }
    parentPaging.innerHTML +=page;
  }
}

function changePage(indexPage){
  renderData(indexPage);
}

function renderTable(jsonData){
  let tbody = document.getElementById("claimTableBody");
  tbody.innerHTML = '';

  let data = jsonData.data;
  for (let i = 0; i < data.length; i++) {
    let claim = data[i];
    let row = `<tr>
                                    <td><input type="checkbox" id="selectAll"></td>
                                    <td>${claim.code}</td>
                                    <td>${claim.customerName}</td>
                                    <td>${claim.nameProduct}</td>
                                    <td>${claim.claimDate}</td>
                                    <td>${claim.descriptionProduct}</td>
                                    <td>${claim.statusName}</td>
                                </tr>`
    tbody.innerHTML += row;
  }
}