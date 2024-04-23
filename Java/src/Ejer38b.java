class Ejer38b extends Terminal {
    
    public static void main(String[] args) {
        var randNumber = 0;
        var number = 0;
        var attempts = 3;
                
        randNumber = (int) (1 + Math.random() * 15);

        printLine("Adivina el número");
        while (number != randNumber && attempts > 0) {
        
            printLine("Introduce un número entre 1 y 15 (Intentos restantes %d):", attempts);
            number = Integer.parseInt(scanLine());
            
            if (number < 1 || number > 15) {
                printLine("Error: debe ser un numero entre 1 y 15");
                attempts += 1;
            }else if (number != randNumber) {
                printLine("¡Fallaste!");
            }

            attempts -= 1;
        }

        if (number == randNumber) {
            printLine("¡Felicidades! Has adivinado el número");
        } else {
            printLine("El número era el %d", randNumber);
        }
    
    }

}


