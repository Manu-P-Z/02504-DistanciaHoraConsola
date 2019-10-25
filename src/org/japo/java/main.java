/* 
 * Copyright 2019 Manu Portolés Zagalá.
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
package org.japo.java;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Manu Portolés Zagalá
 */
public class main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Calendar cal = Calendar.getInstance();

        try {

            int hi;
            int mi;
            int si;

            System.out.printf("%s%n", "Especificar Hora");

             hi = SCN.nextInt();
            SCN.nextLine();

            System.out.printf("%s%n", "Especificar Minutos");

            mi = SCN.nextInt();
            SCN.nextLine();

            System.out.printf("%s%n", "Especificar Segundos");

            si = SCN.nextInt();
            SCN.nextLine();

            System.out.println("----------");
            
            int hs;
            int ms;
            int ss;
            
            hs = cal.get(Calendar.HOUR_OF_DAY);
            ms = cal.get(Calendar.MINUTE);
            ss = cal.get(Calendar.SECOND);
            
            int tiempoen = hi * 3600 + mi * 60 + si;
            int tiemposal = hs * 3600 + ms * 60 + ss;       
            
            int diftiempos = tiemposal - tiempoen;
            
            int diftiempom = diftiempos / 60;
            diftiempos = diftiempom % 60;
            int diftiempoh = diftiempom / 60;
            diftiempom = diftiempoh % 60;
            
            System.out.printf("%s 2d%/2d%/2d%n", "Hora actual ......:");
                    
            
        } finally {
    } System.out.println("Error");
    }
}
