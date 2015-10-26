class six:
  def main():
    totalSq = 0
    totalAd = 0
    for x in range(1, 101):
      totalSq += (x**2)
      totalAd += x
      
    totalAd = totalAd**2
    print("Solution: " + str(totalAd - totalSq))
if __name__ == '__main__':
  six.main()
