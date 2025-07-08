const PAGE_SIZE = 6;
const PAGE_INDEX_INIT = 0;
const BASE_URL = 'http://localhost:8080';


window.onload = async function () {
  renderData(PAGE_INDEX_INIT);
}

function searchClaim(){
  renderData(PAGE_INDEX_INIT)
}

async function renderData(pageIndex){

  let responseDataApi = await callApiClaim(pageIndex);

  renderTable(responseDataApi);

  renderPaging(responseDataApi);
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
                                    <td>${claim.coverageProduct}</td>
                                    <td>${claim.statusName}</td>
                                </tr>`
    tbody.innerHTML += row;
  }
}
function callApiClaim(pageIndex){

  let claimCode = document.getElementById("search-ma-yeu-cau").value;
  let fromDate = document.getElementById('from-date').value;
  let toDate = document.getElementById('to-date').value;
  let statusCode = document.getElementById('trang-thai-yeu-cau').value;

  // 2. build url với các value để thành url http://localhost:8080/api/claim?page=0&size=6&claimCode=CLM0014&fromDate=2024-04-15&toDate=2024-04-19&codeStatus=
  let url = BASE_URL + '/api/v1/claim?page=' + pageIndex + '&size='+PAGE_SIZE + `&claimCode=${claimCode}&fromDate=${fromDate}&toDate=${toDate}&codeStatus=${statusCode}`;
  /*
  fetch:
      chuyên được sử dụng để call api, thực hiện các tác vụ bất đồng bộ
      fetch sẽ trả về 1 promise
   */
  return fetch(url)
  .then(response => {
    // khi call api phản hồi sẽ chạy vào then đầu tiên này
    if (!response.ok){
      alert('call api error')
      throw new Error('call api error')
    }
    // tiếp tục trả về 1 promise
    return response.json();
  }).then(jsonData => {
    // sẽ được call vào sau return của then đầu tiên, đây chính là json data
    console.log(jsonData)
    return jsonData;
  })
}