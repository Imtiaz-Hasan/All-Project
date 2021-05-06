;.MODEL SMALL
;.STACK 1OOH
;.CODE
;MAIN PROC
    
     MOV BH,10101101B
     SUB BH,00000010B
     MOV AL,BH
     MOV BL,10101000B
     ADD AL,BL
     MOV DL,AL
     MOV AX,0238H
     INT 21H
    
    
    
    
    
    
    
    
    ;MAIN ENDP
;END MAIN