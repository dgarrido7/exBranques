String cadena = "Cadena de text a comprobar";
int a = 0, e = 0, i = 0, o = 0, u = 0;

for (int x = 0; x < cadena.length(); x++) {
    char actual = cadena.toLowerCase().charAt(x);

    switch (actual) {
        case 'a':
            a++;
            break;
        case 'e':
            e++;
            break;
        case 'i':
            i++;
            break;
        case 'o':
            o++;
            break;
        case 'u':
            u++;
            break;
        default:
            break;
    }
}

System.out.println("Total de vocals: " + (a+e+i+o+u));

System.out.println(" a: " + a);
System.out.println("e: " + e);
System.out.println("i" + i);
System.out.println("o" + o);
