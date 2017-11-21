$(function() {
			$("#nav-tabs-solidlist").find("li").on("click", function() {
				$(this).addClass("active").siblings().removeClass("active");
				var index = $(this).index();
				if(index==0){
					window.location.href=basePath+"/admin/add";
				}else{
					window.location.href=basePath+"/admin/banlist";
				}
			});
			//文件上传
			mkbanner.init();
			//添加的方法
			mkbanner.add();
		});

		var mkbanner = {
			//文件上传的方法
			init:function(){
				var url = "${basePath}/upload/file";
				$('#fileupload').fileupload(
						{
							url : url,
							dataType : 'json',
							paramName : "doc",
							done : function(e, data) {
								var json = data.result;
								//将上传的url传入
								$("#img").val(json.path);
							},
							progressall : function(e, data) {
								var progress = parseInt(data.loaded / data.total
										* 100, 10);
								$('#progress .progress-bar').css('width',
										progress + '%');
						}
				});
			},
			//添加Banner的方法
			add : function() {
				$("#addmusic").on("click",function() {
					//获取文本框的值
					var title = $("#title").val();
					if (isEmpty(title)) {
						loading("请输入Banner标题");
						$("#title").focus();
						return;
					}
					var description = $("#description").val();
					if (isEmpty(description)) {
						loading("请输入Banner描述");
						$("#description").focus();
						return;
					}
					var img = $("#img").val();
					if (isEmpty(img)) {
						loading("请上传Banner图片");
						$("#img").focus();
						return;
					}
					var status = $("input[type='radio'][name='status']:checked").val();
					//传参
					var param = {
						"title" : title,
						"img" : img,
						"status" : status
					};
					$.ajax({
						type : "post",
						url : basePath + "/admin/addBanner",
						data : param,
						beforeSend : function() {
							//loading("请求处理中。。。");
						},
						error : function(err) {
							console.log("error..." + err);
						},
						success : function(data) {
							if (data == "success") {
								loading("添加成功");
								$("#title").val("");
								$("#description").val("");
								$("#img").val("");
								window.location.href=basePath+"/admin/banlist";
							} else {
								loading("添加失败");
							}
						}
					});
				});
			}
		}