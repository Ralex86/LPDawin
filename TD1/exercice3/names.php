<?php

$data = @include("data.php");

$prenoms = [];

foreach ($data as $key => $value) {
  if (isset($prenoms[$value['first_name']])) {
    $prenoms[$value['first_name']]++;
  } else {
    $prenoms[$value['first_name']] = 0;
  }
}

foreach ($prenoms as $key => $value) {
  echo $key . ": " . $value . " \n ";
}

?>
