.MODEL SMALL
.STACK 100H 
.DATA

     C DB 3
     ;D DB ?
     
.CODE


MAIN PROC 
    
    MOV AX,@DATA
    MOV DS,AX
    
     MOV AL,3
     ;MOV BL,2
     
     
     ;ADD AL,BL
     ;ADD AL,48
      
       ;ADD AL,BL
      
     
     ;SUB AL,BL   
     ADD AL,3
     ADD AL,48 
     
     
     
    
     
     MOV AH,2
     MOV DL,AL
     
     
     INT 21H 
     
     
     

    
    MOV AH,4CH
    INT 21H
    MAIN ENDP
END MAIN