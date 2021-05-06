
.MODEL SMALL
.STACK 100H
.DATA
                A DB   'THE NUMBER IS EQUAL$'
                B DB   'THE NUMBER IS NOT EQAUL$'

.CODE

MAIN    PROC 

        MOV  AX,@DATA
        MOV  DS,AX 

        MOV  AH,1
        INT  21H

        MOV  DL,AL

        INT 21H

        CMP AL,DL
        JNE NOT_EQUAL

        MOV AH,9
        LEA DX,A
        INT 21H
        JMP EXIT

NOT_EQUAL:
        
        MOV AH,9
        LEA DX,B
        INT 21H

EXIT:
        MOV AH,4CH
        INT 21H

MAIN    ENDP
        END  MAIN


