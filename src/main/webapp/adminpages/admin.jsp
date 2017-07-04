<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<title>Admin Dashboard</title>
<meta name="description"
	content="A Bootstrap 4 admin dashboard theme that will get you started. The sidebar toggles off-canvas on smaller screens. This example also include large stat blocks, modal and cards. The top navbar is controlled by a separate hamburger toggle button." />
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="generator" content="Codeply">
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" />
<link
	href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" />

<jsp:include page="../headerfile/admincss.jsp" />

</head>
<body>
	<nav class="navbar navbar-inverse">
	<p class="navbar-text" style="font-size: 25px">Pubhub200</p>

	</nav>
	<div class="container-fluid" id="main">
		<div class="row row-offcanvas row-offcanvas-left">
			<div class="col-md-3 col-lg-2 sidebar-offcanvas" id="sidebar"
				role="navigation" style="margin-top: 20px">
				<ul class="nav flex-column pl-1">
					<li class="nav-item"><a class="nav-link" href="#">Overview</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Analytics</a></li>
					<li class="nav-item"><a class="nav-link" href="#">Orders </a></li>
					<li class="nav-item"><a class="nav-link" href="#">Users</a></li>
					<li class="nav-item"><a class="nav-link" href="#">orderItems</a></li>
				</ul>
			</div>
			<!--/col-->

			<div class="col-md-9 col-lg-10 main" style="margin-top: 50px">

				<!--toggle sidebar button
            <p class="hidden-md-up">
                <button type="button" class="btn btn-primary-outline btn-sm" data-toggle="offcanvas"><i class="fa fa-chevron-left"></i> Menu</button>
            </p>-->

				<h4>
					<b>Admin Dashboard </b>
				</h4>

				<div class="row mb-3" style="margin-top: 50px">
					<div class="col-xl-3 col-lg-6">
						<div class="card card-inverse card-success">
							<div class="card-block bg-success">
								<div class="rotate">
									<i class="fa fa-user fa-5x"></i>
								</div>
								<h6 class="text-uppercase">Users</h6>
								<h1 class="display-1">${USER_COUNT}</h1>
							</div>
						</div>
					</div>
					<div class="col-xl-3 col-lg-6">
						<div class="card card-inverse card-danger">
							<div class="card-block bg-danger">
								<div class="rotate">
									<i class="fa fa-list fa-4x"></i>
								</div>
								<h6 class="text-uppercase">Books</h6>
								<h1 class="display-1">${BOOK_COUNT}</h1>
							</div>
						</div>
					</div>
					<div class="col-xl-3 col-lg-6">
						<div class="card card-inverse card-info">
							<div class="card-block bg-info">
								<div class="rotate">
									<i class="fa fa-twitter fa-5x"></i>
								</div>
								<h6 class="text-uppercase">DELIVERED BOOKS</h6>
								<h1 class="display-1">${ORDER_COUNT}</h1>
							</div>
						</div>
					</div>
					<div class="col-xl-3 col-lg-6">
						<div class="card card-inverse card-warning">
							<div class="card-block bg-warning">
								<div class="rotate">
									<i class="fa fa-share fa-5x"></i>
								</div>
								<h6 class="text-uppercase">ORDERED ITEMS </h6>
								<h1 class="display-1">${ORDER_ITEM_COUNT}</h1>
							</div>
						</div>
					</div>
				</div>
				<!--/row-->

				<hr>

				<a id="features"></a>
				<hr>
				<p class="lead mt-5">The Ordered Items list is given below</p>
				<div class="row my-4">
					<div class="col-lg-3 col-md-4">
						<div class="card">
							<img class="card-img-top img-fluid"
								src="//placehold.it/740x180/bbb/fff?text=..."
								alt="Card image cap">
							<div class="card-block">
								<h4 class="card-title">OrderList</h4>
								<p class="card-text">Flexbox provides simpler, more flexible
									layout options like vertical centering.</p>

							</div>
						</div>
					</div>
				</div>
				<div class="col-lg-9 col-md-8">
					<div class="table-responsive">
						<table class="table table-striped">
							<thead class="thead-inverse">
								<tr>
									<th>#</th>
									<th>Label</th>
									<th>Header</th>
									<th>Column</th>
									<th>Data</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>1,001</td>
									<td>responsive</td>
									<td>bootstrap</td>
									<td>cards</td>
									<td>grid</td>
								</tr>
								<tr>
									<td>1,002</td>
									<td>rwd</td>
									<td>web designers</td>
									<td>theme</td>
									<td>responsive</td>
								</tr>
								<tr>
									<td>1,003</td>
									<td>free</td>
									<td>open-source</td>
									<td>download</td>
									<td>template</td>
								</tr>
								<tr>
									<td>1,003</td>
									<td>frontend</td>
									<td>developer</td>
									<td>coding</td>
									<td>card panel</td>
								</tr>
								<tr>
									<td>1,004</td>
									<td>migration</td>
									<td>bootstrap 4</td>
									<td>mobile-first</td>
									<td>design</td>
								</tr>
								<tr>
									<td>1,005</td>
									<td>navbar</td>
									<td>sticky</td>
									<td>jumbtron</td>
									<td>header</td>
								</tr>
								<tr>
									<td>1,006</td>
									<td>collapse</td>
									<td>affix</td>
									<td>submenu</td>
									<td>flexbox</td>
								</tr>
								<tr>
									<td>1,007</td>
									<td>layout</td>
									<td>examples</td>
									<td>themes</td>
									<td>grid</td>
								</tr>
								<tr>
									<td>1,008</td>
									<td>migration</td>
									<td>bootstrap 4</td>
									<td>flexbox</td>
									<td>design</td>
								</tr>
							</tbody>
						</table>
					</div>
				</div>
			</div>

			<!--/card-columns-->


		</div>
		<!--/main col-->
	</div>

	<!--/.container-->
	<footer class="container-fluid">
	<p class="text-right small">©2016-2017 Company</p>
	</footer>


	<!--scripts loaded here-->

	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js"></script>
	<script
		src="//cdnjs.cloudflare.com/ajax/libs/tether/1.2.0/js/tether.min.js"></script>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js"></script>

	<script src="js/scripts.js"></script>
</body>
</html>