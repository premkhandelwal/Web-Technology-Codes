<?php

require 'db_connect.php';


$uname=$_POST['uname'];


$pword=$_POST['pword'];


$query="insert into
user(userName, password) values('$uname','$pword')";



if(mysqli_query($conn,$query))

{

?>

<script>alert('Registered Successfully!'); location.href="index.php";
</script>

<?php
 
}

else {

echo 'Error: '.mysqli_error($conn);

}


