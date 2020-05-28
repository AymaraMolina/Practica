/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;

/**
 *
 * @author dyzab
 */
public class Func {
    
    public String[] letra={"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N","\u00d1", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    public String[] codigo={"ATTC","ACGA","TGCA","CGTA","CAGT","GATC","GACT","ATTA","AGTC","ACTA","ATGA","AGCA","AGCT","AGCG","AGCC","TCGA","GCTA","ACGT","ATCG","TTGA"+
                "CATG","TGAC","CGTT","TGGC","ACTG","GTCA","GTAC"};
    public String let2, trad=""; 
    
    public String palabras(String pal){
        trad="";
        char let;
        for (int i = 0; i < pal.length(); i++) {
            let = pal.charAt(i);
            for (int j = 0; j < letra.length; j++) {
                let2 = Character.toString(let);
                if(let2.equalsIgnoreCase(letra[j])){
                    trad = trad + codigo[j] + " ";
                    j = letra.length;
                }
                
            }
        }
        
        return trad;
        
    }
    public String codigo(String cod){
        trad="";
        String bloq="";
        String[] cod2 = cod.split(" ");
        for (int i = 0; i < cod2.length; i++) {
            bloq=cod2[i];
            for (int j = 0; j < codigo.length; j++) {
                if(bloq.equalsIgnoreCase(codigo[j])){
                    trad=trad+letra[j];
                    j=codigo.length;                            
                }
            }
        }
        return trad;
        
    }
    
}
