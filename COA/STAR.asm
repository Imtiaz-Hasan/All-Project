.MODEL SMALL
.STACK 100H
.DATA

SQUARE DB '*** $';, 0AH,0DH,'$'
SQUARE2 DB '*$'

NUM2 DB ?
         
         
.CODE
MAIN PROC
MOV AX,@DATA
MOV DS,AX

LEA DX,SQUARE
MOV AH,9
INT 21H

    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H

LEA DX,SQUARE2
MOV AH,9
INT 21H


MOV AH,1
MOV DL,NUM2
INT 21H


LEA DX,SQUARE2
MOV AH,9
INT 21H

    MOV DL,0AH
    MOV AH,2
    INT 21H 
     
    MOV DL,0DH
    MOV AH,2
    INT 21H
     
     
LEA DX,SQUARE
MOV AH,9
INT 21H








MOV AH,4CH
INT 21H

MAIN ENDP
END MAIN