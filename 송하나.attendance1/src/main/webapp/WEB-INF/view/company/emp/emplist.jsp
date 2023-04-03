<%@ page language='java' contentType='text/html; charset=UTF-8' pageEncoding='UTF-8'%>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core'%>
<html>
<head>
<meta charset='utf-8'>
<meta name='viewport' content='width=device-width, initial-scale=1'>
<link href='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css' rel='stylesheet'>
<script src='https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js'></script>
<link rel='stylesheet' href='https://cdn.jsdelivr.net/npm/bootstrap-icons@1.4.0/font/bootstrap-icons.css'>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css" />
<script src='https://code.jquery.com/jquery-3.6.0.min.js'></script>
<script src='<c:url value="/res/common.js"/>'></script>
<link rel='stylesheet' href='<c:url value="/res/common.css"/>'/>
<title></title>
<script>
    $(() => {
        input_company_header()
        input_company_sidebar()
        input_footer()
        btn_click()
        show_logout()
    })
    
    function listEmployees() {
    	$('input').not(':radio').cal('')
    	$('#employees').empty()
    	
    	$.ajax({
    		url: 'employee/get',
    		dataType: 'json',
    		success: employees => {
    			if(employee.length) {
    				const employeeArr = []
    				
    				$.each(employees, (i, employee) => {
    					employeeArr.unshift(
    						`<tr>
    							<td><input type='radio' value='\${employee.empNo}' id='empNo' name='empNo'/></td>
    							<td>\${employee.empNo}</td>
    							<td>\${employee.empName}</td>
    							<td>\${employee.empPh}</td>
    							<td>\${employee.empPosition}</td>
    							<td>\${employee.empAddr}</td>
    							<td>\${employee.empEmail}</td>
    							<td>\${employee.hireDate}</td>
    						</tr>`	
    					)
    				})
    				
    				$('#employees').append(employeeArr.join(''))
    			} else $('#employees').append(
    					'<tr><td colspan=4 class=text-center>직원이 없습니다.</td></tr>')
    		}
    	})
    }
    
    function init() {
    	listEmployees()
    	
    	$('#del').click(() => {
    		if(isVal($('#empNo:checked'))) {
    			$('#modalMsg').text('삭제하시겠습니까?')
    			$('#modalBtn').show()
    			$('#modal').modal('show')
    		}
    	})
    	
    	$('#del').click(() => {
    		$.ajax({
    			url: 'employee/del/' + $('#empNo:checked').val().
    			method: 'delete',
    			success: listEmployees
    		})
    		
    		$('#modal').modal('hide')
    	})
    }
    
    $(init)
    
</script>
<style>

</style>
</head>
<body>
<div class='container'>
    <div class='row header'></div>
    <div class='row mt-5'>
        <div class='col-2 snb'></div>
        <div class='col'>
            <div class='row'>    
                <div class='col'>
                    <h3><b>직원조회</b></h3>
                </div>
                <div class='col pt-3'>
                    <div class='gap-2 d-flex justify-content-end'>
                        <button type='button' class='btn btn-blue' id='add' onclick="location.href='./08.html'">추가</button>
                        <button type='button' class='btn btn-white' id='fix' onclick="location.href='./09.html'">수정</button>
                        <button type='button' class='btn btn-red' id='del' data-bs-toggle='modal' data-bs-target='#delmodal'>삭제</button>
                    </div>
                </div> 
            </div>                 
            <div class='row'>
                <div class='col'>
                    <table class='table'>
                        <thead>
                            <tr><th>선택</th><th>이름</th><th>전화번호</th><th>직급</th><th>주소</th><th>이메일</th><th>입사일</th></tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td><input type='radio' name='employee'></td>
                                <td>김이젠</td>
                                <td>010-1234-4123</td>
                                <td>사장</td>
                                <td>서울 관악구 신림동 110 102호</td>
                                <td>hi12@naver.com</td>
                                <td>2021-03-16</td>
                            </tr>
                            <tr>
                                <td><input type='radio' name='employee'></td>
                                <td>최한석</td>
                                <td>010-1245-1110</td>
                                <td>과장</td>
                                <td>서울 관악구 신림동 130 703호</td>
                                <td>bye09@naver.com</td>
                                <td>2021-12-10</td>
                            </tr>
                            <tr>
                                <td><input type='radio' name='employee'></td>
                                <td>한아름</td>
                                <td>010-9876-1254</td>
                                <td>대리</td>
                                <td>서울 강남구 대치동 11-1</td>
                                <td>akfma@nate.com</td>
                                <td>2022-07-09</td>
                            </tr>
                            <tr>
                                <td><input type='radio' name='employee'></td>
                                <td>김철수</td>
                                <td>010-8765-2345</td>
                                <td>사원</td>
                                <td>서울 관악구 봉천동 154 1호</td>
                                <td>cjftn12@naver.com</td>
                                <td>2022-10-03</td>
                            </tr>
                            <tr>
                                <td><input type='radio' name='employee'></td>
                                <td>양승일</td>
                                <td>010-4567-8910</td>
                                <td>인턴</td>
                                <td>서울 과천시 대공원장로 102</td>
                                <td>tmddlf@naver.com</td>
                                <td>2022-12-20</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <div class='footer'></div>
</div>    
<div class='modal fade' id=delmodal>
    <div class='modal-dialog'>
        <div class='modal-content'>
            <div class='modal-header'>
                <button type='button' class='btn-close' data-bs-dismiss='modal'></button>
            </div>
            <div class='modal-body'>
                <p id='modalMsg'></p>
            </div>
            <div class='modal-footer' id='modalBtn'>
                <button type='button' class='btn btn-lightgray' data-bs-dismiss='modal'>취소</button>
                <button type='button' class='btn btn-blue'  data-bs-dismiss='modal'>확인</button>
            </div>
        </div>
    </div>
</div>
</body>
</html>