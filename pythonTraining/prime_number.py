import sys


try:
    target_num = int(input('数を入力してください。-> '))
except:
    print('入力できるのは数だけです。')
    sys.exit()


if target_num <= 2:
    print('2より大きい整数を入力してください。')
    sys.exit()


for i in range(2,target_num-1):
    if target_num % i == 0:
        print('素数ではない')
        sys.exit()        
print('素数である')
    


