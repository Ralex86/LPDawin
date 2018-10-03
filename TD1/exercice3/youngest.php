<?php

$data = @include("data.php");

$youngest = $data[0];
for ($i = 0; $i < count($data); $i++) {
  if ($youngest['age'] > $data[$i]['age']) {
    $youngest = $data[$i];
  }
}

echo " * " . $youngest['first_name'] . " " . $youngest['last_name'] . " (" . $youngest['age'] . ") \n ";

?>
