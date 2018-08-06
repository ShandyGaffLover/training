import sys


def judge_prime_number(target_num: int) -> None:
    try:
        target_num = int(target_num)
    except:
        print('判定対象は2より大きい整数のみです。')
        return
    if target_num <= 2:
        print('判定対象は2より大きい整数のみです。')
        return
    try:
        if is_known_prime_number(target_num):
            print(target_num,'は既知の素数です。')
            return
        elif is_unknown_prime_number(target_num):
            print(target_num,'は未知の素数です。')
            add_new_prime_to_list(target_num)
            return
        else:
            print(target_num,'は素数ではありません。')
            return
    except ValueError:
        print('例外が発生しました。')
        sys.exit()



def skip_file_header(file):
    '''読み込みファイルの先頭5行をヘッダーとしてスキップする。'''
    for i in range(5):
        next(file)


def add_new_prime_to_list(new_prime: int) -> None:
    '''発見された新しい素数を既知の素数リストに追加する。'''
    with open('primelist.txt', mode='a', encoding='utf-8_sig') as pl:
        print(new_prime, file=pl)
    print(new_prime,'を素数一覧に追加しました。')      


def is_known_prime_number(target_num: int) -> bool:
    '''2より大きい整数について既知の素数かどうか判定を行う。'''
    with open('primelist.txt', encoding='utf-8_sig') as lines:
        skip_file_header(lines)
        for line in lines:
            try:
                known_prime = int(line)
            except ValueError:
                print('ファイルエラー。ファイルに数字以外が入っています。')
                raise
            if target_num == known_prime:
                return True
    return False



def is_unknown_prime_number(target_num: int) -> bool:
    '''2より大きい整数について未知の素数かどうか判定を行う。
       （既知の素数についてはFalseを返却する。）
    '''

    max_known_prime = 2


    '''既知の素数で割り切れるかどうか判定する'''
    with open('primelist.txt', encoding='utf-8_sig') as lines:
        skip_file_header(lines)        
        for line in lines:
            try:
                known_prime = int(line)
            except ValueError:
                print('ファイルエラー。ファイルに数字以外が入っています。')
                raise
            max_known_prime = known_prime
            if target_num % known_prime == 0:
                return False

    '''判定対象が既知の素数の最大値以下ならば、この時点で判定終了'''
    if target_num <= max_known_prime:
        return True


    '''既知の素数の最大値より大きい値で割り切れるかどうか判定する'''
    for i in range(max_known_prime, target_num-1, 1):
        if target_num % i == 0:
            return False
    
    return True


        
