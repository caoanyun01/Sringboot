		$(function() {
			$("#nav-tabs-solidlist").find("li").on("click", function() {
				$(this).addClass("active").siblings().removeClass("active");
				var index = $(this).index();
				if(index==1){
					window.location.href=basePath+"/admin/add";
				}else{
					window.location.href=basePath+"/admin/banlist";
				}
			});
			//获取总数
			var total = $("body").attr("data-totalNum");
			//每页分多少条
			var pageSize = 5;
			//页面加载
			mkbanner.page(0, pageSize);
			//点击分页
			mkbanner.init(total);
			//删除
			mkbanner.del(pageSize);
			//修改
			mkbanner.update();
		});
		var mkbanner = {
			//初始化分页
			init : function(total) {
				//获取数据的总条数
				$(".mkui-page").tzPage(total, {
					items_per_page : 5,
					num_display_entries : 5,
					num_edge_entries : 3,
					prev_text : "前一页",
					next_text : "后一页",
					showGo : true,
					showSelect : true,
					callback : function(pno, pageSize) {
						mkbanner.page(pno, pageSize);
					}
				});
			},
			page : function(pno, pageSize) {
				var pageNo = pno * pageSize;
				var param = {
					"pageNo" : pageNo,
					"pageSize" : pageSize
				};
				$.ajax({
					type : "post",
					url : basePath + "/admin/temp",
					data : param,
					beforeSend : function() {
						loading("数据正在加载中。。。");
					},
					error : function(err) {
						console.log("error..." + err);
					},
					success : function(data) {
						//填充数据
						$("#tbody").html(data);
					}
				});
			},
			//修改的方法
			update : function() {
				//点击图片显示文件上传
				$("#tbody").on("click","img",function(){
					//点击显示文件上传按钮
					$(this).parents("tr").find(".fileimg").show();
				});
				$("#tbody").on("click", ".eixt", function() {
					//获取属性的值
					var id = $(this).data("opid");
					var title = $("#title").val();
					var img = $("#img").val();
					var status = $("input[type='radio']:checked").val();
					
					//传参
					var param ={"id":id,"title":title,"img":img,"status":status}
					
					//隐藏文件上传按钮
					$(this).parents("tr").find(".fileimg").hide();
					$.ajax({
						type:"post",
						url:basePath+"/admin/upBanner",
						data:param,
						beforeSend:function(){
							loading("数据正在修改中。。。。");
						},
						error:function(){
							console.log("error..." + err);
						},
						success:function(data){
							if(data == "success"){	
								loading("修改成功");
							}else{
								loading("修改失败");
							}
						}
					});
				});
			},
			//删除的方法
			del : function(pageSize) {
				$("#tbody").on("click", ".del", function() {
					if(confirm("您确定删除吗？")){
					var id = $(this).data("opid");
					$.ajax({
						type : "post",
						url : basePath + "/admin/delBanner/" + id,
						beforeSend : function() {
							loading("数据正在删除。。。。");
						},
						error : function(err) {
							console.log("error..." + err);
						},
						success : function(data) {
							if (data == "success") {
								loading("删除成功");
								mkbanner.page(0, pageSize);
							} else {
								loading("删除失败");
							}
						}
					});
					}
				});
			}
		};