/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ad.ieseljust.monaco2017_schedule;

import org.w3c.dom.Element;


public class ResultadoCarrera {
    
    private Driver d;
    private String constructor;
    private int initialPos;
    private int finalPos;
    private long timeMillis;
    private int completedLaps;
    private int rankFastesLap;
    private boolean finisher;
    
    
    /**
<Result number="44" position="7" positionText="7" points="6">
    <Driver driverId="hamilton" code="HAM" url="http://en.wikipedia.org/wiki/Lewis_Hamilton">
        <PermanentNumber>44</PermanentNumber>
        <GivenName>Lewis</GivenName>
        <FamilyName>Hamilton</FamilyName>
        <DateOfBirth>1985-01-07</DateOfBirth>
        <Nationality>British</Nationality>
    </Driver>
    <Constructor constructorId="mercedes" url="http://en.wikipedia.org/wiki/Mercedes-Benz_in_Formula_One">
        <Name>Mercedes</Name>
        <Nationality>German</Nationality>
    </Constructor>
    <Grid>13</Grid>
    <Laps>78</Laps>
    <Status statusId="1">Finished</Status>
    <Time millis="6300141">+15.801</Time>
    <FastestLap rank="5" lap="54">
        <Time>1:15.825</Time>
        <AverageSpeed units="kph">158.433</AverageSpeed>
    </FastestLap>
</Result>
*/
    public ResultadoCarrera(Element result){        
       // TO-DO: donar valor als atributs de la classe a partir d'un element "Result" extret del XML.
         
    }   
    
    @Override
    public String toString() {
        String resul= "Resultado de Carrera:\n\t" + d.getName() + " " + d.getSurname() + " conduciendo un " + constructor + 
                "\n\tParte de la posicion: " + initialPos + " y termina en la " + finalPos + 
                "\n\tHa completado "+  completedLaps + " vueltas";
        if (this.finisher)
            resul+= " tardando " +  toHHMMSSmmm(timeMillis);
        else
            resul += " sin completar la carrera";
                
        resul+="\n\tSu clasificacion en vuelta rápida personal=" + rankFastesLap ;
        return resul;
    }
    
    public static String toHHMMSSmmm(long millis){
        long mmm=millis%1000;
        long seconds=millis/1000;
        long s = seconds % 60;
        long m = (seconds / 60) % 60;
        long h = (seconds / (60 * 60)) % 24;
        return String.format("%02d:%02d:%02d:%03d", h,m,s,mmm);
        
    }

    public Driver getD() {
        return d;
    }

    public String getConstructor() {
        return constructor;
    }

    public int getInitialPos() {
        return initialPos;
    }

    public int getFinalPos() {
        return finalPos;
    }

    public long getTimeMillis() {
        return timeMillis;
    }

    public int getCompletedLaps() {
        return completedLaps;
    }

    public int getRankFastesLap() {
        return rankFastesLap;
    }

    public boolean isFinisher() {
        return finisher;
    }
    
      
      
}
