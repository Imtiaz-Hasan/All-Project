.MODEL SMALL
.STACK 100H
.DATA 

    A DB 'PRESS FLOOR NO: $'
    B DB 0DH,0AH,'YOU HAVE REACHED FLOOR: $'
     
.CODE
MAIN PROC
    
   MOV AX,@DATA
   MOV DS,AX 
   
  TOP:
   
   LEA DX,A
   MOV AH,9
   INT 21H
   
   MOV AH,1
   INT 21H
   
   MOV BL,AL
   
  
   
   LEA DX,B
   MOV AH,9
   INT 21H
   
   MOV DL,BL
   MOV AH,2
   INT 21H
   
   MOV DL,0AH
   MOV AH,2
   INT 21H
   MOV DL,0DH
   INT 21H 
   
   LOOP TOP
    
    MAIN ENDP
END MAIN