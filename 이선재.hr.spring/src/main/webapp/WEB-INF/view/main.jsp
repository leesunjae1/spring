<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<script src='https://code.jquery.com/jquery-3.6.0.min.js'></script>
<html>
<head>
<title></title>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css' rel='stylesheet'>
<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css'>
<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js'></script>
<script src='https://code.jquery.com/jquery-3.6.0.min.js'></script>
<script>
    function listLaborers() {
    	$.ajax({
    		url: 'laborer/list',
    		success: laborerList => {
    			laborers = []
    			laborerList.forEach(laborer => {
    				laborers.push(
    						'<li>' + 
    						  laborer.laborerId + ', ' +
    						  laborer.laborerName + ', ' +
    						  laborer.hireDate +
    					    '</li>')
    						
    			})
    			
    			$('#laborerList').empty()
    			$('#laborerList').append(laborers.join(''))
    	}
   	})
} 

$(() => {
	$('#addLaborerBtn').click(() => {
		$.ajax({
			url: 'laborer/add',
			method: 'post',
			contentType: 'application/json',
			data: JSON.stringify({
				laborerId: $('#laborerId').val(),
				laborerName: $('#laborerName').val(),
				hireDate: $('#hireDate').val()
			}),
			success: listLaborers
		})
	})
	
	$('#fixLaborerBtn').click(() => {
		$.ajax({
			url: 'laborer/fix',
			method: 'put',
			contentType: 'application/json',
			data: JSON.stringify({
				laborerId: $('#laborerId').val(),
				laborerName: $('#laborerName').val(),
				hireDate: $('#hireDate').val()
			}),
			success: listLaborers
		})
	})
	
	$('#delLaborerBtn').click(() => {
		$.ajax({
			url: 'laborer/del/' + $('#laborerId').val(),
			method:'delete',
			success: listLaborers
		})
	})
})    
</script>
</head>
 <div class='container'>
<div class='row'>
    <div class='col mb-5'>
        <header class='bg-light shadow p-2'>
            <h1 class='text-center'><b>HR</b></h1>
        </header>
    </div>
</div>
<div class='row'>
    <div class='col mb-3'>
        <form>
            <div class='row '>
                <div class='col-2'>
                    <input type='text' class='form-control'placeholder='노동자명'>
                </div>
                <div class='col'>
                    <div class='row'>
                        <div class='col-2 d-none d-md-inline p-2 text-end'>
                            <label for='hiredate'>입사일: </label>
                        </div>
                        <div class='col-4'>
                            <input type='date'class='form-control'id='hiredate'>
                        </div>
                        <div class='col gap-2 d-flex justify-content-end'>
                            <button type='button' class='btn btn-primary'>
                            <i class='bi bi-plus-circle'></i>
                            <span class='d-none d-md-inline' id='addLaborerBtn'>추가</span>    
                            </button>
                            <button type='button' class='btn btn-success' id='fixLaborerBtn'>
                            <i class='bi bi-check-circle'></i>
                            <span class='d-none d-md-inline'>수정</span>    
                            </button>
                            <button type='button' class='btn btn-danger' id='delLaborerBtn' data-bs-toggle='modal' data-bs-target='#delmodal'>
                            <i class='bi bi-x-circle'></i>
                            <span class='d-none d-md-inline'>삭제</span>    
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </div>
</div>
<div class='row'>
    <div class='col'>
        <table class='table'>
            <thead class='table-warning'>
                 <tr>
                     <th></th><th>ID</th><th>이름</th><th>입사일</th>
                 </tr>    
            </thead>
            <tbody id='laborers'>
                <tr><td colspan='4' class='text-center'>노동자가 없습니다.</td></tr>
            </tbody>
        </table>
    </div>
</div>
<div class='col'>
    <div class='modal fade' id=delmodal>
        <div class='modal-dialog'>
            <div class='modal-content'>
                <div class='modal-header'>
                    <button type='button'class='btn-close'data-bs-dismiss='modal'></button>
                </div>
                <div class='modal-body'>
                    <p>노동자를 삭제하시겠습니까?</p>
                </div>
                <div class='modal-footer'>
                    <button type='button' class='btn btn-secondary'data-bs-dismiss='modal'>아니요</button>
                    <button type='button' class='btn btn-success'>예</button>
                </div>
            </div>
        </div>
    </div>
</div>
</div>
</body>
</html>    