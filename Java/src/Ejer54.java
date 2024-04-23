class Ejer54 extends Terminal {

    public static void main(String[] args) {
        var numRom = "";
        var numRomTemp = "";
        var numAra = 0;

        printLine("Ingrese un número romano:");
        numRom = scanLine().trim().toUpperCase();
        numRomTemp = numRom;

        if (numRomTemp.startsWith("MMM")) {
            numAra = numAra + 3000; // numAra += 3000;
            numRomTemp = numRomTemp.substring(3);
        } else if (numRomTemp.startsWith("MM")) {
            numAra = numAra + 2000;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("M")) {
            numAra = numAra + 1000;
            numRomTemp = numRomTemp.substring(1);
        }

        if (numRomTemp.startsWith("CM")) {
            numAra = numAra + 900;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("DCCC")) {
            numAra = numAra + 800;
            numRomTemp = numRomTemp.substring(4);
        } else if (numRomTemp.startsWith("DCC")) {
            numAra = numAra + 700;
            numRomTemp = numRomTemp.substring(3);
        } else if (numRomTemp.startsWith("DC")) {
            numAra = numAra + 600;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("D")) {
            numAra = numAra + 500;
            numRomTemp = numRomTemp.substring(1);
        } else if (numRomTemp.startsWith("CCC")) {
            numAra = numAra + 300;
            numRomTemp = numRomTemp.substring(3);
        } else if (numRomTemp.startsWith("CC")) {
            numAra = numAra + 200;
            numRomTemp = numRomTemp.substring(2);
        } else if (numRomTemp.startsWith("C")) {
            numAra = numAra + 100;
            numRomTemp = numRomTemp.substring(1);
        }

        printLine("%s", numRomTemp);

        printLine("El número romano %s es igual a %d en el sistema arábigo", numRom, numAra);

    }

}
