var user = {};
function load() {
	console.info('is validating user...')
	$.ajax({
		type: 'GET',
		url: '/frame/user/validateUser.do',
		dataType: 'json',
		success: function(result) {
			if (result.status) {
				console.info('loading page');
				user = result.data;
				console.info(user);
				user.role = user.type == 1 ? '殡仪代办员' :'管理员';
				user.createDate = user.createTime.year + '-' + (user.createTime.month+1) + '-' + user.createTime.day;
				$('#role').html(user.role);
				$('#username').html(user.username);
				$('body').show();
			} else {
				location.href = '/frame/html/login.html';
			}
		},
		error: function() {
			alert('error')
		}
	})
}

function logout() {
	$.ajax({
		type: 'GET',
		url: '/frame/user/logout.do',
		dataType: 'json',
		success: function(result) {
			if (result.status) {
				location.href = '/frame/html/login.html';
			}
		},
		error: function() {
			alert('error')
		}
	})
}
