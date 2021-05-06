.MODEL SMALL
.STACK 100H
.DATA

.CODE 



MAIN PROC   ;INT MAIN
    
   
   MOV AH, 1
   INT 21H  ;INPUT NILAM 'AL' REGISTER E
   
   
   MOV AH, 2
    MOV DL,AL
    INT 21H
   
   
    
    
    
    
   MOV AH, 4CH
   INT 21H 
    
    
  MAIN ENDP  
    END MAIN  ;RETURN 0