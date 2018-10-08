<?php

/**
 * Calcule la somme des n premiers entiers
 */
function somme_entiers($n){
	$sum = 0;
	for ($i=1; $i<=$n; $i++){
		$sum = $sum + $i;
	}

	return $sum;
}

if (somme_entiers(5) == 5+4+3+2+1) {
    echo "OK: somme_entiers\n";
}

/**
 * Cherche la plus petite des valeurs d'un tableau
 */
function valeur_min($tab){

	$min;

	foreach($tab as $i){
		if($i < $min){
			$min = $i;
		}
	}

	return $min;
}

if (valeur_min([5,23,8,19,28,3,55,-52,100,82,75,22]) == -52) {
    echo "OK: valeur_min\n";
}

/**
 * Cherche l'indice de la plus petite des valeurs d'un tableau
 */
function valeur_min_indice($tab){
	$min = valeur_min($tab);
	var_dump("valeur min indice:" . $min);
	for ($i = 0; $i < count($tab); $i++) {
		if($tab[$i] == $min){

			return $i;
		}
	}
	return false;
}



           // indices: 0 1  2 3  4  5 6  7   8   9  10 11
if (valeur_min_indice([5,23,8,19,28,3,55,-52,100,82,75,22]) == 7) {
    echo "OK: valeur_min_indice\n";
}

/**
 * Retourne la somme des éléments du tableau
 */
function somme_tableau($tab)
{
	$sum = 0;

	foreach($tab as $i){
		$sum = $sum + $i;
	}

	return $sum;
}

if (somme_tableau([12,23,4]) == 39) {
    echo "OK: somme_tableau\n";
}

function array_output($tab){
	echo "[";
	foreach($tab as $i) {
		echo " $i ";
	}
	echo "]\n";
}

/**
 * Trie le tableau $tab à l'aide de valeur_min_indice() (sans utiliser sort())
 */
function tri($tab){
	$tab_sorted = [];

	$taille_tab = count($tab);

	for ($i = 0; $i < $taille_tab; $i++) {
		$min_indice = valeur_min_indice($tab);
		$tab_sorted[i] = $tab[$min_indice];
		unset($tab[$min_indice]);
		$tab = array_values($tab);
	}

 	array_output($tab_sorted);
	return $tab_sorted;
}

if (tri([8,5,2,9,3,55,2]) == [2,2,3,5,8,9,55]) {
    echo "OK: tri\n";
}
