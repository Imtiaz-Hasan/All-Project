  .MODEL SMALL
  .STACK 100H
  .DATA
  
  A DB 'HELLO $'
  B DB 'WORLD $'
  
  .CODE
  
  MAIN PROC   
    
    MOV AX,@DATA    
    MOV DS,AX
    LEA DX,A
    MOV AH,9
    INT 21H 
    
    MOV AH,2
    MOV DL,0AH
    INT 21H 
    
    MOV DL,0DH
    INT 21H 
    
    LEA DX,B
    MOV AH,9
    INT 21H
    
    MOV AH,4CH
    INT 21H
    MAIN ENDP
  END MAIN