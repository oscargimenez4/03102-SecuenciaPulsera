/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static void main(String[] args) {
        //Constantes
        final String NOMBRE = "Marta";
        final String NOMBRE_ARTICULO = "Pulsera Hippy";
        final double PRECIO_ARTICULO = 0.70;
        //Variables
        double dineroFinal;
        double dineroInicial = 1;
        System.out.println("Secuencia de Pulsera");
        System.out.println("====================");
        System.out.printf("Nombre de la niña ...: %s%n", NOMBRE);
        System.out.printf(Locale.ENGLISH,"Dinero inicial ......: %.2f €%n", dineroInicial);
        System.out.println("---");
        System.out.printf("Articulo a comprar ..: %s%n", NOMBRE_ARTICULO);
        System.out.printf(Locale.ENGLISH,"Precio artículo .....: %.2f €%n", PRECIO_ARTICULO);
        System.out.println("---");
        dineroFinal = dineroInicial - PRECIO_ARTICULO;
        System.out.printf(Locale.ENGLISH,"Dinero restante .....: %.2f €%n", dineroFinal);
    }
}
