const selectedFiles = [];
const urlCreateClaim = 'http://localhost:8080/api/v1/claim/create';

// code handle file in table
document.getElementById('file-upload').addEventListener('change', function (event) {
  const fileList = event.target.files;
  const documentList = document.getElementById('document-list');

  Array.from(fileList).forEach(file => {
    // Lưu vào mảng selectedFiles
    selectedFiles.push(file);

    const fileType = file.type.split('/')[1].toUpperCase();
    const uploadDate = new Date().toISOString().split('T')[0];

    const row = document.createElement('tr');

    const fileNameCell = document.createElement('td');
    fileNameCell.textContent = file.name;

    const fileTypeCell = document.createElement('td');
    fileTypeCell.textContent = fileType;

    const uploadDateCell = document.createElement('td');
    uploadDateCell.textContent = uploadDate;

    const actionCell = document.createElement('td');
    const viewButton = document.createElement('button');
    viewButton.className = 'btn btn-brand-2nd';
    viewButton.style.marginRight = '2%';
    viewButton.textContent = 'Xem';
    viewButton.addEventListener('click', () => {
      const url = URL.createObjectURL(file);
      window.open(url, '_blank');
    });

    const deleteButton = document.createElement('button');
    deleteButton.className = 'btn btn-brand-2nd';
    deleteButton.textContent = 'Xóa';
    deleteButton.addEventListener('click', () => {
      row.remove();
      const index = selectedFiles.indexOf(file);
      if (index > -1) {
        selectedFiles.splice(index, 1); // Xoá khỏi mảng khi xóa row
      }
    });

    actionCell.appendChild(viewButton);
    actionCell.appendChild(deleteButton);

    row.appendChild(fileNameCell);
    row.appendChild(fileTypeCell);
    row.appendChild(uploadDateCell);
    row.appendChild(actionCell);

    documentList.appendChild(row);
  });


  event.target.value = '';
});


document.getElementById("create-claim").addEventListener("click",addClaim);


async function addClaim() {


  let documentsRequest = await getListDocumentRequest();


  let customerRequest = {
    address: document.getElementById("customer-address").value,
    bankName: document.getElementById("customer-bank-name").value,
    bankNumber: document.getElementById("customer-bank-number").value,
    email: document.getElementById("customer-email").value,
    name: document.getElementById("customer-name").value,
    phoneNumber: document.getElementById("customer-phone").value
  }


  let claimRequestBody = {
    nameProduct: document.getElementById("insurance-product").value,
    description: document.getElementById("claim-description").value,
    amount: document.getElementById("claim-amount").value,
    claimDate: document.getElementById("claim-date").value,
    customer: customerRequest,
    documents: documentsRequest
  }
  let stringJsonBody =JSON.stringify(claimRequestBody);
  console.log(stringJsonBody)

  const response = await fetch(urlCreateClaim,{
    method: "POST",
    headers: {
      "Content-Type": "application/json",
      "Accept": "*/*"
    },
    body: stringJsonBody
  })

  if (!response.ok){
    throw new Error(`Server error ${response.status}`)
  }
  const bodyJson = await response.json();
  alert(`Tạo claim với mã ${bodyJson.data} thành công`);
}

async function getListDocumentRequest() {

  let documentsRequest = [];

  for (const file of selectedFiles) {

    const strBase64 = await convertFileToStBase64(file);

    let documentRequest = {
      documentName: file.name,
      documentType: file.type.split('/')[1],
      updateDate: new Date().toISOString().split('T')[0],
      fileBase64Encoded: strBase64
    }
    documentsRequest.push(documentRequest);
  }
  return documentsRequest;
}


function convertFileToStBase64(file){
  return new Promise((resolve,reject) => {
    const render = new FileReader();
    render.readAsDataURL(file);
    render.onload = () =>resolve(render.result);
    render.onerror = error => reject(error);
  })
}
