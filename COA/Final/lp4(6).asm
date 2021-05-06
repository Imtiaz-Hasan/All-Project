.MODEL SMALL
.STACK 100H
.CODE

MAIN PROC

    MOV BL,80H
    MOV CL,0
    
    TOP:
        CMP CL,10
        JE NEWLINE
     
        INC CL
     
        MOV AH,2
        MOV DL,BL
        INT 21H
        INC BL
     
        CMP BL,0FFH
        JE EXIT
     
        JMP TOP
        
   NEWLINE:
    
        MOV AH,2
        MOV DL,0AH
        INT 21H
        MOV DL,0DH
        INT 21H
        MOV CL,0
        JMP TOP
   EXIT:
 
    MOV AH,4CH
    INT 21H
         
    MAIN ENDP
END MAIN