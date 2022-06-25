import string
def cipher(plain_txt, key):
    alpha = string.ascii_uppercase
    cipher_txt = ''
    for char in plain_txt:
        idx = (alpha.index(char) + key ) % 26
        cipher_txt += alpha[idx]
    return cipher_txt
    
def transposition(plain_txt):
    odd_idx_val , even_idx_val = '', ''
    for i in range(len(plain_txt)):
        if i % 2 == 0:
            even_idx_val += plain_txt[i]
        else:
            odd_idx_val += plain_txt[i]
    return even_idx_val + odd_idx_val
    
cip = cipher('SAFWAAN', 2)
trans = transposition('TOTAL')
print(cip, trans
