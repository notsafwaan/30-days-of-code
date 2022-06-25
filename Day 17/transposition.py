def transposition(plain_txt):
    odd_idx_val , even_idx_val = '', ''
    for i in range(len(plain_txt)):
        if i % 2 == 0:
            even_idx_val += plain_txt[i]
        else:
            odd_idx_val += plain_txt[i]
    return even_idx_val + odd_idx_val
trans = transposition('TOTAL')
print(trans)
