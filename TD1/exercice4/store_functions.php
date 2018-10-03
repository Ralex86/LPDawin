<?php

/**
 * Charge les produits
 */
$products = @include('products.php');

if (!is_array($products)) {
    $products = [];
}

/**
 * Liste les produits
 */
function storeList()
{
    global $products;

    echo "Liste des produits :\n";

    foreach ($products as $name => $infos) {
        printf("* %s, quantité: %d, prix: %g\n", $name, $infos['quantity'], $infos['price']);
    }
}

/**
 * Ajout d'élément au magasin
 */
function storeAdd($name, $quantity)
{
    global $products;

    if (!isset($products[$name])) {
        $products[$name] = [
            'price' => null,
            'quantity' => 0,
        ];
    }

    $products[$name]['quantity'] += $quantity;

    storePersist();
}

/**
 * Modifier le prix d'un élément
 */
function updatePrice($name, $price) {
  global $products;
  if (isset($products[$name])) {
    $products[$name] = [
      'price' => 0,
      'quantity' => $products[$name]['quantity'],
    ];
  }
  $products[$name]['price'] = $price;
  storePersist();
}

/**
 * Modifier la quantité d'un élément
 */
function remove($name, $quantity) {
  global $products;
  if (isset($products[$name])) {
    $products[$name] = [
      'price' => $products[$name]['price'],
      'quantity' => $products[$name]['quantity'],
    ];
  }
  $products[$name]['quantity'] -= $quantity;
  storePersist();
}

/**
 * Modifier la description d'un élément
 */
function setDescription($name, $desc) {
  global $products;
  if (isset($products[$name])) {
    $products[$name] = [
      'price' => $products[$name]['price'],
      'quantity' => $products[$name]['quantity'],
      'description' => null,
    ];
  }
  $products[$name]['description'] = $desc;
  storePersist();
}

/**
 * Rechercher un élément
 */
function search($desc) {
  global $products;
  foreach ($products as $name => $infos) {
    if ((strpos($name, $desc) !== false) or (strpos($infos['description'], $desc) !== false)) {
      printf("* %s, quantité: %d, prix: %g\n", $name, $infos['quantity'], $infos['price']);
    }
  }
  storePersist();
}

/**
 * Persiste les éléments dans le fichier
 */
function storePersist()
{
    global $products;

    file_put_contents('products.php', '<?php return ' . var_export($products, true) . ';');
}
