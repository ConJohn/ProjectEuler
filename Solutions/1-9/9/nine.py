class Nine:
	@staticmethod
	def main():
		for i in range(1,1000):
			for j in range(1, i+1):
				c = 1000 - (i+j)
				if i**2 + j**2 == c**2:
					print("Solution: " + str(i*j*c))
					
if __name__ == '__main__':
	Nine.main()
