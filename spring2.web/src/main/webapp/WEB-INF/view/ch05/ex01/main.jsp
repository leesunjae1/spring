<%@ page language='java' contentType='text/html; charset=utf-8' pageEncoding='utf-8' %>
<script src='https://code.jquery.com/jquery-3.6.0.min.js'></script>
<script>
function init() {
	$('#getBtn').click(() => {
		$.ajax({
			url: 'get',
			method: 'get',
			data: {
				userId: 1,
				username: '최한석',
				birthday: '2023-03-09'
			},
			contentType: 'application/x-www-form-urlencoded'
		}).done(user => console.log(user))
	})
	
	$('#postBtn').click(() => {
		$.ajax({
			url: 'post',
			method: 'post',
			data: JSON.stringify({
				userId: 2,
				username: '한아름',
				birthday: '2023-04-10'
			}),
			contentType: 'application/json'
		}).done(user => console.log(user))
	})
	
	$('#putBtn').click(() => {
		$.ajax({
			url: 'put',
			method: 'put',
			data: JSON.stringify({
				userId: 3,
				username: '양승일',
				birthday: '2023-05-12'
			}),
			contentType: 'application/json'
		}).done(user => console.log(user))
	})
	
	$('#patchBtn').click(() => {
		$.ajax({
			url: 'patch',
			method: 'patch',
			data: JSON.stringify({
				userId: 4,
				username:'김가람',
				birthday: '2023-07-17'
			}),
			contentType: 'application/json'
		}).done(user => console.log(user))
	})
	
	$('#deleteBtn').click(() => {
		$.ajax({
			url: 'delete',
			method: 'delete',
			data: JSON.stringify({
				userId: 5,
				username: '박돈일',
				birthday: '2025-05-05'
			}),
			contentType: 'application/json'
		}).done(user => console.log(user))
	})
}
$(init)
</script>

<nav>
	<button type='button' id='getBtn'>GET</button>
	<button type='button' id='postBtn'>POST</button>
	<button type='button' id='putBtn'>PUT</button>
	<button type='button' id='patchBtn'>PATCH</button>
	<button type='button' id='deleteBtn'>DEL</button>
</nav>