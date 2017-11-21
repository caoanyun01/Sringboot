$(function(){
	zxComment.init();
});

var zxComment = {
	init:function(){
		//修改用户信息
		zxComment.update();
		//文件上传
		zxComment.upload();
	},
	//修改用户信息
	update:function(){
			$(".btn-primary").on("click",function(){
			var cname=$("#cname").val();
			var name=$("#name").val();
			var tel=$("#tel").val();
			var province=$("#province").val();
			var city=$("#city").val();
			var address=$("#address").val();
			var id=$("#userId").data("userid");
			var user={
				cname:cname,
				name:name,
				tel:tel,
				province:province,
				city:city,
				address:address,
				id:id
			};
			$.ajax({
				type:"post",
				url:"http://localhost:8080/admin/update",
				data:user,
				beforeSend:function(){
					console.log("数据加载中...");
				},
				error:function(err){
					console.log("error..."+err);
				},
				success:function(data){
					alert(data);
				}
			});
		});
		//修改密码
		$(".modal-content").on("click","#loginbtn",function(){
			var pwd=$("#pwd").val();
			var pwd1=$("#pwd1").val();
			if(pwd==pwd1){
				$.ajax({
					type:"post",
					url:"http://localhost:8080/admin/upPwd",
					data:{pwd:pwd},
					beforeSend:function(){
						console.log("数据加载中...");
					},
					error:function(err){
						console.log("error..."+err);
					},
					success:function(data){
						alert(data);
					}
				});
			}else{
				alert("两次密码不一致！");
			}
			
		});
	},
	//添加用户
	save:function(){
		$("#add").on("click",function(){
			$("#addusername").val();
		});
	},
	//文件上传
	upload:function(){
	  var url = "http://localhost:8080/upload/file";
	    $('.fileup').fileupload({
	        url: url,
	        dataType: 'json',
	        done: function (e, data) {//文件上传成功以后执行的函数
	       
	         console.log(data);
	        	var $input = $(e.target);//拿到你当前点击是那个删除按钮e.target
	        	//var $container = $input.parents(".container");
	        	var json = data.result;
	        	console.log(json.oname);
	        	console.log(json.newname);
	        	console.log(json.path);
	        	console.log(json.ext);
	        	console.log(json.size);
	        	console.log(json.contentType);
	        	$("#top_Pic").append("<img src='http://localhost:8080/"+json.path+"'>");  
	        },
	        progressall: function (e, data) {//进度条
	           /* var $input = $(e.target);//拿到你当前点击是那个删除按钮e.target
	        	var $container = $input.parents(".container");
	        	
	            var progress = parseInt(data.loaded / data.total * 100, 10);
	            $container.find('.progress-bar').css(
	                'width',
	                progress + '%'
	            );*/
	        }
	    });
	}
		
};