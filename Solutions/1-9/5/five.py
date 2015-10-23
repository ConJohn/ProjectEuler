class Five:
	@staticmethod
	def main():
		counter = 1
		run = True
		while run:
			if counter % 20 == 0 and counter % 19 == 0 and counter % 18 == 0 and counter % 17 == 0 and counter % 16 == 0 and counter   %   15 == 0 and counter   % 14 == 0 and counter % 13 == 0 and counter % 12 == 0 and counter % 11 == 0:
				print("Solution: " + str(counter))
				run = False
			else:
				counter += 1
if __name__ == '__main__':
	Five.main()
