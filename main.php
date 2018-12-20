<?php
$date1 = microtime(true);
function forLoop(){
    for($tmp=0; $tmp <= 1000000; $tmp++){
        $x = 22;
        $y = 7;
        $z = $x/$y;
        $a = $z/$y;
        echo "\n".$a;
    }
}

forLoop();
$date2 = microtime(true);
echo "\nStart at : ";
echo $date1;
echo "\nFinished at : ";
echo $date2;
echo "\nTime taken : ";
$dTime = $date2 - $date1;
echo $dTime;
?>
