<?php

$data = @include("data.php");

foreach ($data as $person) {
  echo " * " . $person['first_name'] . " " . $person['last_name'] . " (" . $person['age'] . ") \n";
}
?>
