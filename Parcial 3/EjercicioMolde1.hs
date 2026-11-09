{-
Ejercicio 1.1 · Suma de impares de un intervalo
Escribí una función recursiva con guardas sumaImparesIntervalo que sume los números impares
que hay entre dos valores (incluidos), dados en cualquier orden.
Ejemplos: sumaImparesIntervalo 1 9 → 25 · sumaImparesIntervalo 9 1 → 25 ·
sumaImparesIntervalo 4 4 → 0
-}
sumaImparesIntervalo :: Int->Int->Int
sumaImparesIntervalo a b
    | a>b = sumaImparesIntervalo b a
    | a == b = if odd a then a else 0 
    | odd a = a + sumaImparesIntervalo (a+1) b
    | otherwise = sumaImparesIntervalo (a+1) b

{-
Ejercicio 1.2 · Distancia y aplicación parcial
Definí distancia :: Int -> Int -> Int, la distancia entre dos números (el valor absoluto de la
resta; podés usar abs).
Después, usando aplicación parcial de distancia, definí distanciaA0 y distanciaA100.
Ejemplos: distancia 3 10 → 7 · distanciaA100 70 → 30 · distanciaA0 (-5) → 5
-}
distancia :: Int -> Int -> Int
distancia x y = abs (x-y)
distanciaA0 :: Int -> Int
distanciaA0 = distancia 0
distanciaA100 :: Int -> Int
distanciaA100 = distancia 100

{-
Ejercicio 1.3 · Escribir las declaraciones
Escribí solo la firma de cada función. Usá Int para los enteros y Float donde haga falta.
-}
esPositivo :: Int -> Bool
esPositivo n = n > 0
mitades :: [Float] -> [Float]
mitades = map (/ 2)
primerYUltimo :: [Int] -> (Int -> Int)
primerYUltimo xs = (head xs, last xs)
contarSi :: (Int -> Bool) -> [Int] -> Int
contarSi p = length . filter p
{-
Ejercicio 1.4 · Porcentaje de aprobados
Definí porcentajeAprobados :: [Float] -> Float usando dos funciones recursivas:
contarAprobados (cuántas notas son mayores o iguales a 6) y contarTotal (cuántas notas hay). Las
dos devuelven Int.
Con la lista vacía, el porcentaje es 0.
Ejemplos: porcentajeAprobados [7, 4, 9, 5] → 50.0
-}
contarAprobados :: [Float] -> Int --Usar fromIntegral
contarAprobados [] = 0
contarAprobados(x:xs) = (if x >= 6 then 1 else 0) + contarAprobados xs
contarTotal :: [Float] -> Int
contarTotal [] = 0
contarTotal(_:xs) = 1 + contarTotal(xs)
porcentajeAprobados :: [Float] -> Float
porcentajeAprobados [] = 0
porcentajeAprobados aprob = fromIntegral (contarAprobados aprob) * 100 / fromIntegral (contarTotal aprob)
{-
Ejercicio 1.5 · ¿Longitud impar?
Usando composición y sin funciones del Prelude (sin length ni odd), definí tieneLongitudImpar
:: String -> Bool.
Ejemplos: tieneLongitudImpar "Ana" → True · tieneLongitudImpar "Juan" → False
-}
contarLongitud :: String -> Int
contarLongitud [] = 0
contarLongitud(_:xs) = 1 + contarLongitud(xs)
esImpar :: Int -> Bool
esImpar 0 = False
esImpar 1 = True
esImpar n = esImpar(n-2)
tieneLongitudImpar :: String -> Bool
tieneLongitudImpar = esImpar . contarLongitud

-- TANDA 1 B
{-
Ejercicio 1-B.1 · Suma de pares de un intervalo
Escribí una función recursiva con guardas sumaParesIntervalo que sume los números pares entre
dos valores (incluidos), dados en cualquier orden.
Ejemplos: sumaParesIntervalo 2 8 → 20 · sumaParesIntervalo 8 2 → 20 · sumaParesIntervalo 3 7
→ 10 · sumaParesIntervalo 3 3 → 0
-}
sumaParesIntervalo :: Int -> Int -> Int
sumaParesIntervalo a b
    |a > b = sumaParesIntervalo b a
    |a == b = if even a then a else 0
    |even a = a + sumaParesIntervalo (a + 1) b
    |otherwise = sumaParesIntervalo (a + 1) b
{-
Ejercicio 1-B.2 · Diferencia y aplicación parcial
Definí diferencia :: Int -> Int -> Int, que devuelve el primer número menos el segundo.
Después, usando aplicación parcial de diferencia, definí desde100 (100 menos el número) y
desde0 (0 menos el número).
Ejemplos: diferencia 10 3 → 7 · desde100 30 → 70 · desde0 7 → -7
-}
diferencia :: Int -> Int -> Int
diferencia x y = x - y
desde100 :: Int -> Int
desde100 = diferencia 100
desde0 :: Int -> Int
desde0 = diferencia 0
{-
Ejercicio 1-B.3 · Escribir las declaraciones
Escribí solo la firma de cada función. Usá Int para los números.
-}
esCero :: Int -> Bool
esCero n = n == 0
dobles :: [Int] -> [Int]
dobles = map (* 2)
extremos :: [Int] -> (Int , Int)
extremos xs = (minimum xs, maximum xs)
aplicarDos :: (Int -> Int) -> (Int -> Int) -> Int -> Int
aplicarDos f g x = f (g x)
{-
Ejercicio 1-B.4 · Porcentaje de positivos
Definí porcentajePositivos :: [Int] -> Float usando dos funciones recursivas:
contarPositivos (cuántos son mayores que 0) y contarElementos (cuántos hay). Las dos devuelven
Int. Con la lista vacía, el porcentaje es 0.
Ejemplos: porcentajePositivos [3, -1, 0, 5] → 50.0 · porcentajePositivos [] → 0.0
-}
contarPositivos :: [Int] -> Int
contarPositivos [] = 0
contarPositivos(x:xs) = (if x > 0 then 1 else 0) + contarPositivos(xs)
contarElementos :: [Int] -> Int
contarElementos [] = 0
contarElementos(_:xs) = 1 + contarElementos(xs)
porcentajePositivos :: [Int] -> Float
porcentajePositivos [] = 0
porcentajePositivos pos = fromIntegral (contarPositivos pos) * 100 / fromIntegral (contarElementos pos)
{-
Ejercicio 1-B.5 · ¿Cantidad impar de vocales?
Usando composición y sin funciones del Prelude (sin length, filter ni odd), definí
cantidadVocalesImpar :: String -> Bool. Para contarVocales podés usar elem.
Ejemplos: cantidadVocalesImpar "casa" → False (2 vocales) · cantidadVocalesImpar "sol" →
True (1 vocal)
-}
vocales :: String -> Int
vocales [] = 0
vocales (x:xs) = (if x `elem` "aeiou" then 1 else 0) + vocales(xs)
esImpar :: Int -> Bool
esImpar 0 = False
esImpar 1 = True
esImpar n = esImpar(n-2)
cantidadVocalesImpar :: String -> Bool
cantidadVocalesImpar = esImpar . vocales 

-- TANDA C
{-
Ejercicio 1-C.1 · Suma de múltiplos de 5 de un intervalo
Escribí una función recursiva con guardas sumaMultiplos5 que sume los múltiplos de 5 entre dos
valores (incluidos), dados en cualquier orden.
Ejemplos: sumaMultiplos5 1 20 → 50 · sumaMultiplos5 20 1 → 50 · sumaMultiplos5 7 7 → 0 ·
sumaMultiplos5 10 10 → 10
-}
sumaMultiplos5 :: Int -> Int -> Int
sumaMultiplos5 a b
    |a>b = sumaMultiplos5 b a
    | a == b = (if a `mod` 5 == 0 then a else 0) 
    | a `mod` 5 == 0 = a + sumaMultiplos5(a+1) b
    | otherwise = sumaMultiplos5(a+1)b

{-
Ejercicio 1-C.2 · Porcentajes y aplicación parcial
Definí porcentaje :: Float -> Float -> Float, que recibe primero el porcentaje y después el
valor, y devuelve ese porcentaje del valor.
Después, usando aplicación parcial, definí iva21 (el 21% de un valor) y mitad (el 50%).
Ejemplos: porcentaje 10 300 → 30.0 · iva21 200 → 42.0 · mitad 9 → 4.5
-}
porcentaje :: Float -> Float -> Float
porcentaje x y = (y * x) /100
iva21 :: Float->Float
iva21 = porcentaje 21
mitad :: Float -> Float
mitad = porcentaje 50
{-
Ejercicio 1-C.3 · Escribir las declaraciones
Escribí solo la firma de cada función. Usá Int para los números.
-}
mayorQue :: Int -> Int -> Bool
mayorQue x y = x > y
iniciales :: [String] -> String
iniciales = map head -- recibe una lista de nombres
sumaYProducto :: Int -> Int -> (Int,Int)
sumaYProducto a b = (a + b, a * b)
cuantosCumplen :: (Int -> Bool) -> [Int] -> Int
cuantosCumplen p xs = length (filter p xs)
{-
Ejercicio 1-C.4 · Promedio de las aprobadas
Definí promedioAprobadas :: [Float] -> Float, el promedio de las notas mayores o iguales a 6,
usando dos funciones recursivas: sumaAprobadas (devuelve Float) y contarAprobadas (devuelve
Int). Si no hay ninguna aprobada, devuelve 0.
Ejemplos: promedioAprobadas [7, 4, 9, 5] → 8.0 · promedioAprobadas [3, 2] → 0.0
-}
sumaAprobadas :: [Float] -> Float
sumaAprobadas [] = 0
sumaAprobadas(c:cs) = (if c >= 6 then c else 0) + sumaAprobadas(cs)
contarAprobadas :: [Float] -> Int
contarAprobadas [] = 0
contarAprobadas(c:cs) = (if c >= 6 then 1 else 0) + contarAprobadas(cs)
promedioAprobadas :: [Float] -> Float
promedioAprobadas ns =  if contarAprobadas ns == 0 then 0
                        else sumaAprobadas ns / fromIntegral (contarAprobadas ns)

{-
Ejercicio 1-C.5 · ¿Cantidad par de aes?
Usando composición y sin funciones del Prelude, definí cantidadParDeAes :: String -> Bool,
que dice si la letra 'a' aparece una cantidad par de veces. contarAes tiene que ser recursiva y sin
guardas.
Ejemplos: cantidadParDeAes "casa" → True (2) · cantidadParDeAes "banana" → False (3)
-}
contarAes :: String -> Int
contarAes [] = 0
contarAes (x:xs) = (if x `elem` "a" then 1 else 0) + contarAes(xs)
esParA :: Int->Bool
esParA
esParA 0 = True
esParA 1 = False
esParA n = esParA(n-2)
cantidadParDeAes :: String -> Bool
cantidadParDeAes = esParA . contarAes

-- TANDA D
{-
Ejercicio 1-D.1 · Producto de pares de un intervalo
Escribí una función recursiva con guardas productoParesIntervalo que multiplique los números
pares entre dos valores (incluidos), dados en cualquier orden. Si no hay ningún par, devuelve 1. Ojo
con el caso base: es un producto.
Ejemplos: productoParesIntervalo 1 6 → 48 · productoParesIntervalo 6 1 → 48 ·
productoParesIntervalo 3 3 → 1
-}
productoParesIntervalo :: Int -> Int -> Int
productoParesIntervalo a b
    |a>b = productoParesIntervalo b a
    |a == b = (if even a then a else 1)
    |even a = a * productoParesIntervalo (a+1) b
    |otherwise = productoParesIntervalo (a+1) b
{-
Ejercicio 1-D.2 · Rangos y aplicación parcial
Definí entre :: Int -> Int -> Int -> Bool, que recibe un mínimo, un máximo y un número, y dice
si el número está entre los dos (incluidos).
Después, usando aplicación parcial de entre, definí esDigito (entre 0 y 9) y esNota (entre 1 y 10).
Ejemplos: entre 1 5 3 → True · esDigito 7 → True · esNota 11 → False
-}
entre :: Int -> Int -> Int -> Bool
entre a b c = c >= a && c=<b
esDigito :: Int -> Bool
esDigito = entre 0 9
esNota :: Int -> Bool
esNota = entre 1 10
{-
Ejercicio 1-D.3 · Escribir las declaraciones
Escribí solo la firma de cada función. Usá Int y Float según corresponda.
-}
esVocal :: Char -> Bool
esVocal c = c `elem` "aeiou"
promedioDos :: Float -> Float -> Float
promedioDos a b = (a + b) / 2
primero :: (Int,Int) -> Int
primero (a, _) = a -- recibe una tupla de dos Int
transformar :: (Int->Int) -> [Int] -> [Int]
transformar f = map f

{-
Ejercicio 1-D.4 · Porcentaje de vocales
Definí porcentajeVocales :: String -> Float usando dos funciones recursivas: contarVocales
(sin guardas; podés usar elem) y contarLetras. Las dos devuelven Int. Con el texto vacío, el
porcentaje es 0.
Ejemplos: porcentajeVocales "casa" → 50.0 · porcentajeVocales "" → 0.0
-}
contarVocales :: String -> Int
contarVocales [] = 0
contarVocales(x:xs) = (if x `elem` "aeiou" then 1 else 0) + contarVocales(xs)
contarLetras :: String -> Int
contarLetras [] = 0
contarLetras(_:xs) = 1 + contarLetras(xs)
porcentajeVocales :: String -> Float
porcentajeVocales ales (x:xs) = if x == 0 then 0 
                            else fromIntegral (contarVocales ales) * 100 / fromIntegral (contarLetras ales)
{-
Ejercicio 1-D.5 · ¿Termina en vocal?
Usando composición y sin funciones del Prelude (sin last), definí ultimoEsVocal :: String ->
Bool. Necesitás una ultimo :: String -> Char recursiva (con el texto vacío, error) y una esVocal
:: Char -> Bool con patrones constantes.
Ejemplos: ultimoEsVocal "casa" → True · ultimoEsVocal "sol" → False
-}
ultimo :: String -> Char
ultimo [] = error "Texto vacio"
uñtimo [x] = x
ultimo(_:xs) = ultimo(xs)
esVocal :: Char -> Bool
esVocal 'a' = True
esVocal 'e' = True
esVocal 'i' = True
esVocal 'o' = True
esVocal 'u' = True
esVocal _ = False
ultimoEsVocal :: String -> Bool
ultimoEsVocal = esVocal . ultimo
-- TANDA E
{-
Ejercicio 1-E.1 · Contar pares de un intervalo
Escribí una función recursiva con guardas contarParesIntervalo que diga cuántos números pares
hay entre dos valores (incluidos), dados en cualquier orden. Ojo: acá se cuenta, no se suma.
Ejemplos: contarParesIntervalo 1 10 → 5 · contarParesIntervalo 10 1 → 5 ·
contarParesIntervalo 3 3 → 0 · contarParesIntervalo 4 4 → 1
-}
contarParesIntervalo :: Int -> Int -> Int
contarParesIntervalo a b 
    |a>b = contarParesIntervalo b a
    |a == b = (if even a then 1 else 0)
    |even a = 1 + contarParesIntervalo (xs)
    |otherwise = contarParesIntervalo(xs)
{-
Ejercicio 1-E.2 · Divisibilidad y aplicación parcial
Definí divisible :: Int -> Int -> Bool, que recibe primero el divisor y después el número, y
dice si el número es divisible por el divisor. La firma termina en Bool: pensá si hace falta un if.
Después, usando aplicación parcial de divisible, definí esPar y esMultiplo3.
Ejemplos: divisible 5 20 → True · esPar 7 → False · esMultiplo3 9 → True
-}
divisible :: Int -> Int -> Bool
divisible c d = c `mod` d == 0 
esPar :: Int -> Bool
esPar = divisible 2
esMultiplo3 :: Int -> Bool
esMultiplo3 = divisible 3
{-
Ejercicio 1-E.3 · Escribir las declaraciones
Escribí solo la firma de cada función. Para la última, copiá el lado izquierdo del =: una casilla por
nombre, más el resultado.
-}
esMayor :: Int -> Int -> Bool
esMayor a b = a > b
esConsonante :: Char -> Bool
esConsonante c = not (c `elem` "aeiou")
notasAltas :: [Float] -> [Float]
notasAltas = filter (\n -> n >= 8) -- recibe notas con decimales
contarSi :: (Int->Bool)->[Int] ->[Int] -> Int
contarSi p xs = length (filter p xs) -- xs es una lista de Int
{-
Ejercicio 1-E.4 · Promedio de los pares
Definí promedioPares :: [Int] -> Float, el promedio de los números pares de la lista, usando dos
funciones recursivas: sumaPares y contarPares (las dos devuelven Int). Si no hay ningún par,
devuelve 0.
Una de las dos suma y la otra cuenta: fijate qué va en cada then.
Ejemplos: promedioPares [1,2,3,4] → 3.0 · promedioPares [1,3] → 0.0
-}
sumaPares :: [Int] -> Int
sumaPares [] = 0
sumaPares(x:xs) = (if even x then x else 0) + sumaPares(xs)
contarPares :: [Int] -> Int
contarPares [] = 0
contarPares(x:xs) = (if even x then 1 else 0) + contarPares(xs)
promedioPares :: [Int] -> Float
promedioPares pares (x:xs) = if x == 0 then 0
                             else fromIntegral (sumaPares pares) / fromIntegral (contarPares pares)
{-
Ejercicio 1-E.5 · ¿El máximo es par?
Usando composición y sin funciones del Prelude (sin maximum, max ni even), definí maximoEsPar ::
[Int] -> Bool. Necesitás una maximo recursiva (con la lista vacía, error) y una esPar propia.
Ejemplos: maximoEsPar [3, 8, 5] → True · maximoEsPar [3, 7, 5] → False
-}
maximo :: [Int] -> Int
maximo [] = error "Lista vacia"
maximo [x] = x
maximo (x:xs) = max x (maximo xs)
esPar :: Int -> Bool
esPar 0 = True
esPar 1 = False
esPar m = esPar(n-2)
maximoEsPar :: [Int] -> Bool
maximoEsPar = esPar . maximo 
{-
Ejercicio 1-E.6 · Bonus · Lambdas y composición
a) aprobadas :: [Float] -> [Float]: deja las notas mayores o iguales a 6, con filter y una
lambda.
b) conBonus :: [Float] -> [Float]: suma 0.5 a cada nota, con map y una lambda.
c) aprobadasConBonus, por composición: primero suma el bonus y después filtra.
Ejemplos: aprobadasConBonus [5.5, 4, 7] → [6.0,7.5]
-}
aprobadas :: [Float] -> [Float]
aprobadas = filter(\x -> x >= 6)
conBonus :: [Float] -> [Float]
conBonus = map(\x -> x + 0.5)
aprobadasConBonus :: [Float] -> [Float]
aprobadasConBonus = aprobadas . conBonus