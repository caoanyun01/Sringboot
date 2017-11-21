/*弹出框*/
function loading(content,timeout){
	var $loading = $("<div class='mkloading animated bounceInLeft'>"+
		"<span>"+content+"</span>"+
	"</div>");
	$("body").append($loading);
	var width = $loading.width();
	var height = $loading.height();
	$loading.css({marginLeft:(-width/2),marginTop:(-height/2)});
	$loading.on("click",function(){
		$(this).removeClass("animated bounceInLeft")
		.addClass("animated bounceOutRight")
		.fadeOut("slow",function(){
			$(this).remove();
			if($loading.timer)clearInterval($loading.timer);
		});
	});
	
	if(!timeout)timeout=3;
	if($loading.timer)clearInterval($loading.timer);
	//定时器消息
	$loading.timer = setInterval(function(){
		$loading.trigger("click");
	},timeout*1000);
}
/*登录*/
$('#login-button').click(function (event) {
		event.preventDefault();
		$('form').fadeOut(500);
		$('.wrapper').addClass('form-success');
		var username=$("#username").val();
		var password=$("#password").val();
		var user={
			username:username,
			password:password
		}
		$.ajax({
			type:"post",
			url:"http://localhost:8080/login",
			data:user,
			beforeSend:function(){
				console.log("数据加载中...");
			},
			error:function(err){
				console.log("error..."+err);
			},
			success:function(data){
				if(data=="success"){
					location.href = "http://localhost:8080/admin/index";
				}else{
					loading("您输入的密码错误",1);
					$('form').fadeIn(500);
					$('.wrapper').removeClass('form-success');
					$("#password").val("").focus();
				}
			}
		});
	});