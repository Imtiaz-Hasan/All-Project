.MODEL SMALL
.STACK 100H
.DATA
      NUM1 DB ?
      
.CODE

MAIN PROC  
    
    
    
    
    MOV BH,4
    MOV BL,5
    
    ADD BH,BL ;BH=BH+BL
    
    ADD NUM1,BH ;NUM1=NUM1+BH
    
    
    
    
    INT 21H
   
   
   
   
   
   
           
    ;MOV AH,4
    ;MOV DL,'6' 
    ;INT 21H
           
           
           
    
  MAIN ENDP    
END MAIN