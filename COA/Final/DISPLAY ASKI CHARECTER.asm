.MODEL SNMMALL
.STACK 100H
.DATA
.CODE

MAIN PROC
           
           MOV AH,2
           MOV CX,256
           MOV DL,0
           
     PRINT_LOOP:
     
           INT 21H
           INC DL
           DEC CX
           JNZ PRINT_LOOP
           
           MOV AH,4CH
           INT 21H
    
    
    MAIN ENDP
END MAIN