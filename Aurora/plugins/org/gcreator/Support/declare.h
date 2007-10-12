#ifndef _GCPP_SUPPORT_DECLARE_
#define _GCPP_SUPPORT_DECLARE_

class GApi::Support::Rectangle
{
	public:
		Rectangle(int,int,int,int);
		int x;
		int y;
		int width;
		int height;
};

class GApi::Support::Color
{
	private:
		int red;
		int green;
		int blue;
	public:
		Color(int,int,int);
		static const GApi::Support::Color* const Red;
		static const GApi::Support::Color* const Green;
		static const GApi::Support::Color* const Blue;
		static const GApi::Support::Color* const Yellow;
		static const GApi::Support::Color* const Purple;
		static const GApi::Support::Color* const LightBlue;
		static const GApi::Support::Color* const Black;
		static const GApi::Support::Color* const White;
		int getRed();
		int getGreen();
		int getBlue();
		static GApi::Support::Color* Darker(GApi::Support::Color*,int);
		static GApi::Support::Color* Lighter(GApi::Support::Color*,int);
		static GApi::Support::Color* Merge(GApi::Support::Color*,GApi::Support::Color*);
};

#endif
