class One:
  @staticmethod
  def main():
    total = 0;
    for x in range(0,1000):
      if x%3 == 0 or x%5 == 0:
        total += x
    print("Solution: " + str(total))
if __name__ == '__main__':
  One.main()
