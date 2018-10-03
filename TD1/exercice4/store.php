<?php

/**
 * Inclusion des fonctions de gestion du magasin
 */
require_once(__DIR__.'/store_functions.php');


/**
 *  Actions qu'il est possible d'effectuer
 */
$actions = [
    'list' => function() {
        storeList();
    },
    'add' => function($name = null, $quantity = null) {
        if ($name === null or $quantity === null) {
            echo "Arguments: name quantity\n";
        } else {
            storeAdd($name, $quantity);
        }
    },
    'set-price' => function($name = null, $price = null) {
        if ($name === null or $price === null) {
          echo "Arguments: name price\n";
        } else {
          updatePrice($name, $price);
        }
    },
    'remove' => function($name = null, $quantity = null) {
      if ($name === null or $quantity === null) {
        echo "Arguments: name quantity\n";
      } else {
        remove($name, $quantity);
      }
    },
    'set-description' => function($name = null, $desc = null) {
      if ($name === null or $desc === null) {
        echo "Arguments: name description\n";
      } else {
        setDescription($name, $desc);
      }
    },
    'search' => function($keyword) {
      if ($keyword === null) {
        echo "Arguments: name keywords\n";
      } else {
        search($keyword);
      }
    }
];

/**
 * Récupère l'argument et appelle la fonction correspondante
 */
array_shift($argv);

if (!$argv || !isset($actions[$argv[0]]))
{
    echo "Usage: php store.php [action] <argument1 <argument2 ...>>\n";
    echo "Actions: ".implode(', ', array_keys($actions))."\n";
    exit(0);
}

$action = $actions[$argv[0]];
array_shift($argv);

call_user_func_array($action, $argv);
