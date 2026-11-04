
{-
MULTIPLE CHOICE:
1-C Utiliza definiciones puramente matematicas haciendo uso de recursividad
2-B Porq es un lenguaje perezoso
3-B 
4-B map lo que hace es aplicar la funcion a cada elemento de la lista
5-B basicamente lo que hace haskell es trabajar argumento por argumentyo convirtiendolo en una funcion
6-A Y D se hace uso de la funcion map la B no compila y la C tampoco
7-C usa aplicacion parcial para "duplicar"
8-A porq haskell primero hace 3 + y y despues y=4 entonces 3+3=7
-}
--10
producto :: Int->Int -> Int
producto a b
| a>b = producto b a
| a == b = a
| otherwise = a * producto(a + 1) b

--11
mayor::Int->Int->Int
mayor x y = if x >= y then x else y
maximode3 :: Int -> Int -> Int -> Int
maximode3 x y z = mayor x (mayor y z)
--12
duplicarLista :: [Int]->[Int]
duplicarLista= map(*2)
esMuchoMayor :: Int->Int->Bool
esMuchoMayor n m = n-m > 10 
--13
sumarNotas :: [Float] -> Float
sumarNotas[] = 0
sumarNotas(x:xs) = x + sumarNotas xs

contarNotas :: [Float] -> Float
contarNotas[] = 0
contarNotas(_:xs) = 1 + contarNotas xs

promedio:: [Float]->Float
promedio [] = 0
promedio notas = sumarNotas notas / contarNotas notas
--14
contar :: String -> Int
contar [] = 0
contar(_:xs) = 1 + contar xs
esPar :: Int -> Bool
esPar 0 = True
esPar 1 = False
esPar n = esPar(n-2)

nombrePar :: Int ->Bool
nombrePar = esPar . contar



