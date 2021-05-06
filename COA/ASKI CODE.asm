.MODEL SMALL
.STACK 100H
.CODE

MAIN PROC
    MOV BL,3H
    SUB BL,48
    
    MOV AL,2H
    SUB AL,48
    
    SUB BL,AL
    
               
    MOV AH,2           
    MOV DL,BL
    
    INT 21H           
               
    MOV AH, 4CH
   INT 21H           
    MAIN ENDP
END MAIN