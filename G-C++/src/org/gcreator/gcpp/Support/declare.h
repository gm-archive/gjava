#ifndef _GCPP_SUPPORT_DECLARE_
#define _GCPP_SUPPORT_DECLARE_

class org::gcreator::Support::Rectangle
{
	public:
		Rectangle(int,int,int,int);
		int x;
		int y;
		int w;
		int h;
};

class org::gcreator::Support::Color
{
	private:
		int red;
		int green;
		int blue;
	public:
		Color(int,int,int);
		static const org::gcreator::Support::Color* const Red;
		static const org::gcreator::Support::Color* const Green;
		static const org::gcreator::Support::Color* const Blue;
		static const org::gcreator::Support::Color* const Yellow;
		static const org::gcreator::Support::Color* const Purple;
		static const org::gcreator::Support::Color* const LightBlue;
		static const org::gcreator::Support::Color* const Black;
		static const org::gcreator::Support::Color* const White;
		int getRed();
		int getGreen();
		int getBlue();
		static org::gcreator::Support::Color* Darker(org::gcreator::Support::Color*,int);
		static org::gcreator::Support::Color* Lighter(org::gcreator::Support::Color*,int);
		static org::gcreator::Support::Color* Merge(org::gcreator::Support::Color*,org::gcreator::Support::Color*);
};

#endif
