.MODEL SMALL
.STACK 100H
.DATA
  C DB 'KHUDA lagce? $'
 B DB 'INPUT A NUMBER: $'
 E DB 'iNPUT 2ND NUMBER: $' 
 F DB 'OUTPUT: $'
 D DB ?
 A DB ?
 


.CODE
MAIN PROC
    
    
    
   MOV AX,@DATA
   MOV DS,AX 
   
   
   LEA DX,C
   MOV AH,9
   INT 21H
   
   MOV DL,0AH
   MOV AH,2
   INT 21H
           
   MOV DL,0DH
   INT 21H        
   
   
   LEA DX,B
   MOV AH,9
   INT 21H 
   
   MOV AH,1
   INT 21H 
   
   MOV A,AL
    
    MOV DL,0AH
    MOV AH,2
    INT 21H
    
    MOV DL,0DH
    INT 21H
   
   LEA DX,E
   MOV AH,9
   INT 21H
   
   
   MOV AH,1
   INT 21H
   
   MOV D,AL
   
    MOV DL,0AH
    MOV AH,2
    INT 21H
    
    MOV DL,0DH
    INT 21H
    
    LEA DX,F
   MOV AH,9
   INT 21H
           
           
   
   MOV AL,A
   MOV BL,D
   ADD AL,BL
   SUB AL,30H
   MOV DL,AL
   
   
   
   
   
   
   
   
   
   ;MOV DL,AL
   
   MOV AH,2
   INT 21H
   
   
    
    
     MOV AH,4CH
     INT 21H
    
    
    MAIN ENDP
END MAIN
