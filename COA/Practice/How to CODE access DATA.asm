.MODEL SMALL
.STACK 100H
.DATA 


  ;BH BL 8 BITS REGISTER 1 BYTE
  ;BX 16 BITS REGISTER 1 WORD

   NUM DB 'e'  ;e =101
   NUM2 DB ?
   CHAR DB '#'
   STR DB "MY NAME IS IMTIAZ HASAN "  
   CHAR2 DB ?


.CODE        



MAIN PROC
    
        MOV AX , @DATA
        MOV DS , AX
    
    
    
    
    
  MAIN ENDP
    END MAIN