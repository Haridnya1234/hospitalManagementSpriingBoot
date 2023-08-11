import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SignupasComponent } from './signupas.component';

describe('SignupasComponent', () => {
  let component: SignupasComponent;
  let fixture: ComponentFixture<SignupasComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [SignupasComponent]
    });
    fixture = TestBed.createComponent(SignupasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
