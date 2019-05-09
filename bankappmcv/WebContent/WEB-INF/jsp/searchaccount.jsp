<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">MY BANK</a>
         <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarText">
          <ul class="navbar-nav mr-auto">
            <li class="nav-item">
                <a class="nav-link" href="New Account.html">New Account</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Withdraw.html">Withdraw Amount</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Deposit Amount.html">Deposit Amount</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Delete Account.html">Delete Account</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Update Details.html">Update Details</a>
            </li>
            <li class="nav-item">
                <a class="nav-link active" href="#">Search Account</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Fund Transfer.html">Fund Transfer</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Check Bal.html">Check Balance</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="Display Details.html">Account Details</a>
            </li>
        </ul>
        </div>
    </nav>
    <div class="container">
      
    <h1 style="text-align:center;">Search Account</h1>
      <div class="layout">
    <form action="Search Account.do" method="post">
            <div class="form-group row">
                <div class="col-sm-2"></div>
              <label for="acno" class="col-sm-2 col-form-label">Account number :</label>
              <div class="col-sm-5">
                <input type="number" name="account_id" class="form-control" id="acno" placeholder="Enter Account Number" required>
              </div>
            <div class="form-group row">
                <div class="col-sm-3"></div>
              <div class="col-sm-5">
                <button type="submit" class="btn btn-primary">Search</button>
              </div>
            </div>
            </div>
          </form>
        </div>
</div>
</body>
</html>