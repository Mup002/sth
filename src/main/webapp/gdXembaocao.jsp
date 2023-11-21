<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>


<html>
<head>
  <title>Xem bao cao</title>
  <link rel="stylesheet" href="styles.css">
  <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
  <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script>
  <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<header>
  <h1>Xem bao cao</h1>
</header>

<nav>
  <select class="form-select form-select-lg mb-3" aria-label=".form-select-lg example" onchange="redirectToSelectedOption(this)">
    <option selected>Chon thong ke</option>
    <option value="1">Nha cung cap</option>
    <option value="2">Mat hang</option>
    <option value="3">Doanh thu</option>
  </select>
</nav>
<script>
  function redirectToSelectedOption(selectElement){
    var selectedValue = selectElement.value;
    if(selectedValue === '1'){
      window.location.href = '/ncc';
    }else if(selectedValue === '2'){

    }else if(selectedValue === '3'){

    }
  }
</script>
</body>
</html>