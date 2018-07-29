import sys


def judge_fizz_buzz(num: int) -> str:
    """入力された数字をもとにFizzBuzzのルールに従って値を返却する。"""
    VOICE_WHEN_MULTIPLES_OF_3='Fizz'
    VOICE_WHEN_MULTIPLES_OF_5='Bizz'
    VOICE_WHEN_MULTIPLES_OF_15='Fizz Buzz'
    if num % 3 == 0 and num % 5 == 0:
        return VOICE_WHEN_MULTIPLES_OF_15
    if num % 3 == 0:
        return VOICE_WHEN_MULTIPLES_OF_3
    if num % 5 == 0:
        return VOICE_WHEN_MULTIPLES_OF_5
    
    return num


try:
    max=int(input('input max num -> '))
except ValueError:
    print('エラーです。数字を入力してください。')
    sys.exist()
for count in range(1,max+1,1):
    print(judge_fizz_buzz(count))
